@echo off

echo Generating java from grammar files...
java -jar libs/antlr-3.4-complete.jar src/com/riis/decompiler/DexToSourceCasting.g -o src/com/riis/decompiler
java -jar libs/antlr-3.4-complete.jar src/com/riis/decompiler/DexToSourceHello.g -o src/com/riis/decompiler
java -jar libs/antlr-3.4-complete.jar src/com/riis/decompiler/DexToSourceWordpress.g -o src/com/riis/decompiler

echo.
echo Compiling java...
mkdir bin
javac -d bin src/com/riis/decompiler/*.java -classpath libs/antlr-3.4-complete.jar

echo.
pause