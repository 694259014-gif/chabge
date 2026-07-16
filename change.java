 void main() {

        IO.print("Enter amount to pay: ");
        int pay = Integer.parseInt(IO.readln()); 

        int change = 1000 - pay;
        int totalChange = change; 

        int b500 = change / 500;
        change %= 500;

        int b100 = change / 100;
        change %= 100;

        int b50 = change / 50;
        change %= 50;

        int b20 = change / 20;
        change %= 20;

        int c10 = change / 10;
        change %= 10;

        int c5 = change / 5;
        change %= 5;

        int c2 = change / 2;
        change %= 2;

        IO.println("Change is : " + totalChange + " baht");
        IO.println("Five-hundred note: " + b500 + " note(s)");
        IO.println("Hundred note: " + b100 + " note(s)");
        IO.println("Fifty note: " + b50 + " note(s)");
        IO.println("Twenty note: " + b20 + " note(s)");
        IO.println("Ten coin: " + c10 + " coin(s)");
        IO.println("Five coin: " + c5 + " coin(s)");
        IO.println("Two coin: " + c2 + " coin(s)");
        IO.println("Two coin: " + change + " coin(s)");
    }
