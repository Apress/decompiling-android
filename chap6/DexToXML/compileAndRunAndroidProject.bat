@echo off

echo Running on %1...

set STARTPATH=%CD%

echo.
echo Compiling Android files...
call android update project --target 8 --path %1
cd %1
call ant release
cd %STARTPATH%

echo.
echo Running dex2jar...
cd libs/dex2jar-0.0.9.9
call d2j-dex2jar --force ../../%1/bin/classes.dex -o ../../%1/DexToXML/classes.jar
cd ../..

echo.
echo Dedexing dex file...
call dx --dex --verbose-dump --dump-to=%CD%/%1/DexToXML/dex.dump --dump-width=9999 %CD%/%1/DexToXML/classes.jar

echo.
echo Running DexToXML
java -classpath libs/antlr-3.4-complete.jar;bin com/riis/decompiler/DexToXML %1/DexToXML/dex.dump

pause
