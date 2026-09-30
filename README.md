Their responsibilities will be:

cli/ → handles the command-line interface and arguments.
command/ → contains Gex's actual commands, such as status, go-back, etc.
git/ → contains the code that communicates with the real Git executable.

--- 

nvim src/main/java/com/gex/GexApplication.java

public static void main(String[] args)

is the entry point of the Java application.

--- 

GexApplication
      │
      │ receives args
      ▼
CommandParser
      │
      │ determines command
      ▼
"status"

--- 


