import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.freeinternals.classfile.core.AbstractCPInfo;
import org.freeinternals.classfile.core.AccessFlags;
import org.freeinternals.classfile.core.AttributeCount;
import org.freeinternals.classfile.core.AttributeInfo;
import org.freeinternals.classfile.core.CPCount;
import org.freeinternals.classfile.core.ClassFile;
import org.freeinternals.classfile.core.ClassFormatException;
import org.freeinternals.classfile.core.FieldCount;
import org.freeinternals.classfile.core.FieldInfo;
import org.freeinternals.classfile.core.Interface;
import org.freeinternals.classfile.core.InterfaceCount;
import org.freeinternals.classfile.core.MajorVersion;
import org.freeinternals.classfile.core.MethodCount;
import org.freeinternals.classfile.core.MethodInfo;
import org.freeinternals.classfile.core.MinorVersion;
import org.freeinternals.classfile.core.SuperClass;
import org.freeinternals.classfile.core.ThisClass;
import org.freeinternals.classfile.ui.Tool;

/**
 *
 * @author Godfrey Nolan
 */
public class ClassToXML {

    /**
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        try {
            ClassToXML.extractClassFile();
        } catch (IOException ex) {
            Logger.getLogger(ClassToXML.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        } catch (ClassFormatException ex) {
            Logger.getLogger(ClassToXML.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
    }

    private static void extractClassFile() throws IOException, ClassFormatException {

        File file = new File("C:/Temp/Casting.class");
        byte[] classByteArray = Tool.readClassFile(file);
        ClassFile classfile = new ClassFile(classByteArray);

        ClassToXML.printClassFile(classfile);
    }

    private static void printClassFile(ClassFile classfile) {
        // Magic Number
        System.out.println("<MagicNumber>CAFEBABE</MagicNumber>");

        // Minor & Major version
        MinorVersion minorVersion = classfile.getMinorVersion();
        System.out.println("<MinorVersion>" + minorVersion.getValue() + "</MinorVersion>");

        MajorVersion majorVersion = classfile.getMajorVersion();
        System.out.println("<MajorVersion>" + majorVersion.getValue() + "</MajorVersion>");

        // Constant Pool
        System.out.println("<ConstantPool>");

        CPCount cpCount = classfile.getCPCount();
        // System.out.println("Constant Pool size: " + cpCount.getValue());

        AbstractCPInfo[] cpArray = classfile.getConstantPool();
        for (int i = 1; i < cpCount.getValue(); i++) {
			System.out.println("<ConstantPoolEntry>");
			System.out.println("<id>" + i + "</id>");
            // split Description on ':' to get ConstantPoolType
			String type_delims = "[:]";
			String[] type_tokens = classfile.getCPDescription(i).split(type_delims);
			System.out.println("<ConstantPoolType>" + type_tokens[0] + "</ConstantPoolType>");

            // split type_tokens[0] on ',' to get ConstantPoolValue
			String value_delims = "[,]";
			String[] value_tokens = type_tokens[1].split(value_delims);
			for (int tc = 0; tc < value_tokens.length; tc++)
				System.out.println("<ConstantPoolValue>" + value_tokens[tc] + "</ConstantPoolValue>");

            short tag = cpArray[i].getTag();
            if ((tag == AbstractCPInfo.CONSTANT_Double) || (tag == AbstractCPInfo.CONSTANT_Long)) {
                i++;
            }
			System.out.println("</ConstantPoolEntry>");
        }

        System.out.println("</ConstantPool>");


        // Access flag, this & super class
        AccessFlags accessFlags = classfile.getAccessFlags();
		String access_delims = "[ ]+";
		String[] access_tokens = accessFlags.getModifiers().split(access_delims);
		for (int ac = 0; ac < access_tokens.length; ac++)
				System.out.println("<AccessFlags>" + access_tokens[ac] + "</AccessFlags>");

        ThisClass thisClass = classfile.getThisClass();
        System.out.println("<ThisClass>" + thisClass.getValue() + "</ThisClass>");

        SuperClass superClass = classfile.getSuperClass();
        System.out.println("<SuperClass>" + superClass.getValue() + "</SuperClass>");


        // Interfaces
        InterfaceCount interfaceCount = classfile.getInterfacesCount();
        System.out.println("<Interface Count>" + interfaceCount.getValue() + "</InterfaceCount>");

        if (interfaceCount.getValue() > 0) {
			System.out.println("<Interfaces>");

            Interface[] interfaceArray = classfile.getInterfaces();
            for (int i = 0; i < interfaceArray.length; i++) {
				System.out.println("<Interface>" + interfaceArray[i].getValue() + "</Interface>");
            }
			System.out.println("</Interfaces>");
        }
        // Fields
        FieldCount fieldCount = classfile.getFieldCount();
        System.out.println("<FieldCount>" + fieldCount.getValue() + "</FieldCount>");

        if (fieldCount.getValue() > 0) {
			System.out.println("<Fields>");

            FieldInfo[] fieldArray = classfile.getFields();
            for (int fc = 0; fc < fieldArray.length; fc++) {
				System.out.println("<Field>");
				System.out.println("<id>" + fc + "</id>");
				System.out.println("<Name>" + fieldArray[fc].getDeclaration() + "</Name>");
				System.out.println("</Field>");
            }
			System.out.println("</Fields>");
        }

        // Methods
        MethodCount methodCount = classfile.getMethodCount();
        System.out.println("<MethodCount>" + methodCount.getValue() + "</MethodCount>");

        if (methodCount.getValue() > 0) {
			System.out.println("<Methods>");
            MethodInfo[] methodArray = classfile.getMethods();
            for (int mc = 0; mc < methodArray.length; mc++) {
				System.out.println("<Method>");
				System.out.println("<id>" + mc + "</id>");
				System.out.println("<Name>" + methodArray[mc].getDeclaration() + "</Name>");
				System.out.println("</Method>");

            }
			System.out.println("</Methods>");

        }

        // Attributes
        AttributeCount attributeCount = classfile.getAttributeCount();
        System.out.println("<AttributeCount>" + attributeCount.getValue() + "</AttributeCount>");

        AttributeInfo[] attributeArray = classfile.getAttributes();
		System.out.println("<Attributes>");
        for (int attc = 0; attc < attributeArray.length; attc++) {
				System.out.println("<Attribute>");
				System.out.println("<id>" + attc + "</id>");
				System.out.println("<Name>" + attributeArray[attc].getName() + "</Name>");
				System.out.println("</Attribute>");
        }
		System.out.println("</Attributes>");

    }
}
