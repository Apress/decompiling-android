1) Compile DexToXML to get everything generated to run *
	make.bat

2) Execute the samples**
	compileAndRunAndroidProject.bat run-projects/HelloWorld
	compileAndRunJavaProject.bat run-projects/Casting

* Make sure you're running JDK 1.6 and change your PATH accordingly
** DexToXML uses the dx dump file instead of the dedexer in the book as the dx dump file turns out to be a more consistent format for parsing.