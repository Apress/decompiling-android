1) Compile DexToSource to get everything generated to run *
	make.bat

2) Execute the samples, call run.bat with two arguments. 
The first is the .ddx file to decompile.
The second is which ANTLR grammar to use: casting, hello, or wordpress
	run.bat run-projects/Casting/Casting.ddx casting
	run.bat run-projects/Hello/Hello.ddx hello
	run.bat run-projects/Wordpress/Wordpress.ddx wordpress	

* Make sure you're running JDK 1.6, change your PATH accordingly
