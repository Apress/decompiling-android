@echo off

echo.
echo Running DexToSource on %1...
java -classpath libs/antlr-3.4-complete.jar;bin com/riis/decompiler/DexToSource %1 %2

echo.
pause