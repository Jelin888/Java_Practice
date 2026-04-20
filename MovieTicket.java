cd C:\Users\JELIN\OneDrive\Documents\NetBeansProjects\MovieTicket; "JAVA_HOME=C:\\Program Files\\Java\\jdk-21" cmd /c "\"C:\\Users\\JELIN\\Downloads\\netbeans-29-bin\\netbeans\\java\\maven\\bin\\mvn.cmd\" -Dexec.vmArgs= \"-Dexec.args=${exec.vmArgs} -classpath %classpath ${exec.mainClass} ${exec.appArgs}\" -Dexec.appArgs= -Dexec.mainClass=com.mycompany.movieticket.MovieTicket \"-Dexec.executable=C:\\Program Files\\Java\\jdk-21\\bin\\java.exe\" -Dmaven.ext.class.path=C:\\Users\\JELIN\\Downloads\\netbeans-29-bin\\netbeans\\java\\maven-nblib\\netbeans-eventspy.jar --no-transfer-progress process-classes org.codehaus.mojo:exec-maven-plugin:3.5.1:exec"
Scanning for projects...

---------------------< com.mycompany:MovieTicket >----------------------
Building MovieTicket 1.0-SNAPSHOT
  from pom.xml
--------------------------------[ jar ]---------------------------------

--- resources:3.3.1:resources (default-resources) @ MovieTicket ---
skip non existing resourceDirectory C:\Users\JELIN\OneDrive\Documents\NetBeansProjects\MovieTicket\src\main\resources

--- compiler:3.13.0:compile (default-compile) @ MovieTicket ---
Recompiling the module because of changed source code.
Compiling 1 source file with javac [debug release 21] to target\classes

--- exec:3.5.1:exec (default-cli) @ MovieTicket ---
How many tickets do you want? (Enter Quantity): 5

-------------------------------------------
              TAX INVOICE
-------------------------------------------
Movie: World Famous Lover
Theatre: SVC - Apsara Picture Palace
-------------------------------------------
Total Ticket Cost:              Rs. 560.00
Quantity:                       5 tickets
-------------------------------------------
Booking Charge:                 Rs. 18.0
Internet Handling Charge:       Rs. 27.0
CGST @ 9%:                      Rs. 50.40
SGST @ 9%:                      Rs. 50.40
-------------------------------------------
TOTAL AMOUNT (A+B):             Rs. 705.80
-------------------------------------------
       Enjoy your movie!
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  36.922 s
Finished at: 2026-04-21T00:09:18+05:30
------------------------------------------------------------------------
