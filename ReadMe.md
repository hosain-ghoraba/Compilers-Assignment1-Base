# Assignment1 Base

### This project aims at relieving you from the setup & integration hassle between Antler and java, you don't need to download or install Antler, you just have to:

1. Clone the repository
2. Write your Antler code(with embedeed java syntax) in `Assignment1.g4` file which exists in './src/main/antlr4/antlr/bits/Assignment1.g4'
3. Run `mvn clean package` in the **root directory**
4. Run the `App.java` file, which exists in './src/main/java/antlr/bits/App.java' , then the output of the code written in `Assignment1.g4` on the test cases given in the assignment description will be printed to the console.

**Note that after any change in Assignment1.g4 file, you need to run "mvn clean package" again before running the App.java file.**
<br><br>
Note also that Assignment.g4 file includes **an example** of how to write Antler + java code in it
