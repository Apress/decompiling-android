@echo off

echo Running on %1...

set STARTPATH=%CD%

cd %1
mkdir bin
mkdir DexToXML
cd %STARTPATH%

echo.
echo Compiling Java files...
call javac -d %1/bin %1/src/*.java

echo.
echo Converting .class to .dex...
call dx --dex --output=%CD%/%1/DexToXML/classes.dex %CD%/%1/bin

echo.
echo Running dex2jar...
cd libs/dex2jar-0.0.9.9
call d2j-dex2jar --force ../../%1/DexToXML/classes.dex -o ../../%1/DexToXML/classes.jar
cd ../..

echo.
echo Dedexing dex file...
call dx --dex --verbose-dump --dump-to=%CD%/%1/DexToXML/dex.dump --dump-width=9999 %CD%/%1/DexToXML/classes.jar

echo.
echo Running DexToXML
java -classpath libs/antlr-3.4-complete.jar;bin com/riis/decompiler/DexToXML %1/DexToXML/dex.dump

pause
