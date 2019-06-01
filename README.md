# Swipe-Machine
## Introduction
Attendance Swipe Machine
Created for taking attendance using an excel spreadsheet list of names.
Note: This is still a work in progress.

## How to use

1.  You need to have Java 8 installed on the PC you are using it on.

2.  The list of names you use will need to be in a certain format.
    I have included an "Example Nominal Roll.csv" in the "saves" folder.
    The columns are: SERVICE NO. | RANK | LAST NAME | INITIALS
    The program works off service numbers so ensure that they are correct.
    The other columns don't matter so much. For example you could have first names instead of initials.
    If a column is blank for any entries other than the service number it will display a dash "-".
    
3.  Run the "SwipeMachine.jar" file.

4.  Click the "Import List" button to load your list of attendees.

5. Enter the name of the meeting/event.

6. The quorum count is automatically set to 30%. This can be changed on the fly using the spinner buttons or by entering a value into the input box.

7. The "Members #" can be changed to suit if you have a specific number to reach but don't have all the names on your list.
