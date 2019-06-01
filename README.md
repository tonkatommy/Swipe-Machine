# Swipe-Machine
## Introduction
Attendance Swipe Machine
Created for taking attendance using an excel spreadsheet list of names.
Note: This is still a work in progress.

## Setup

### Requirements & File Format

- You need to have Java 8 installed on the PC you are using it on.

- The list of names you use will need to be in a ".csv" format.  
I have included an "Example Nominal Roll.csv" in the "saves" folder.  
The columns are: SERVICE NO. | RANK | LAST NAME | INITIALS.  
**The program works using the service numbers so ensure that they are correct.**  
The other columns don't matter so much. For example you could have first names instead of initials.  
If a column is blank for any entries other than the service number it will display a dash "-".  
   
### Run the program

- Run the "SwipeMachine.jar" file.

## Configurating the program

### Information
- **Meeting Name:** Enter the name for the meeting.
- **Date of Meeting:** Enter the date for the meeting.
- **# of Members:** This will update after importing a new list. It can also be changed manually if not all names are on the list you have.
- **% for quorum:** 30% is the default. Can be changed as required.
- **# required:** The number of members required to reach the quorum. This will update automatically when the values above are changed.
- **Swiped:** Shows the current number of members that have swiped in.

### Quorum Met
- This label will remain "QUORUM NOT MET" in red until the "# required" is met. It will then change to "QUORUM MET" in green.

### Members List
- **Import** : This button will prompt for a nominal roll file that should be in the format described above. Navigate to it and click Open.
- **Clear List** : This will clear the current Members List on the right side panel.

### Swiped Members List
- **Remove Last** : Will remove the last swiped member from the Swiped Members list.
- **Remove Selected** : Currently does nothing.

### Actions
- **Save** : Saves the current Swiped Members list to a file of your choosing.  

### Swiped Members
- **Input** : The cursor must be here for the program to detect the card swipe.  
You may also manually type in a service number here to add them to the list. If they are on the nominal roll it will show their name. If they are not it will still add them to the list but will display "NOT IN ROLL".  
***Beware:*** there must be no one swiping while typing as it will type over the input and be invalid.

### Members List
- Shows the currently loaded list of names.  
Names can be double-clicked to add manually. This is intended for faulty/lost cards.  
A name can be manually added at any time.

## Swiping Cards
- The cursor **must** be in the "Input:" box for the program to work.
- Swiping a card will enter the data from the magnetic strip into the Input box.  
The program will automatically add the member to the list.
- Two card readers can be used. The input is fast enough that it won't matter. However, on the odd chance two cards are swiped simultaneously, the program will reject the input and the cards will need to swipe again. 

