public class SimpleNumbersArray {

    // FIELDS
    private int[] simpleNumArray = new int[100];

    // GET+SET
    // not necessary

    // CONSTRUCTORS
    public SimpleNumbersArray() {
        simpleNumArray[0] = 2;
        byte lastCell = 1;
        boolean flag = false;

        for (int lastNum = 3; lastCell < 100; lastNum++) {
            for (int z = 2; z <= lastNum / 2; z++) {
                if (lastNum % z == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                simpleNumArray[lastCell] = lastNum;
                lastCell++;
            } else {
                flag = false;
            }
        }
    }

    // METHODS
    public void printSimpleNumbersArray() {
        for (byte b = 0; b < 10; b++) {
            String line = "";
            for (byte c = 0; c < 10; c++) {
                line += simpleNumArray[(b * 10) + c] + "\t";
            }
            System.out.println(line);
        }
    }
}
