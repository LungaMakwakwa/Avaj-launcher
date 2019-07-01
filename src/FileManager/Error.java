package FileManager;

public class Error {

    public void error_proof(String[] airCraftList)
    {
        for (int n = 1; n < airCraftList.length; n++)
        {
            String[] check = airCraftList[n].split(" ");

            if ((check[1].charAt(0) != check[0].charAt(0)) || check[1].length() < 2) {
                System.out.println("Error on line " + (n + 1) + ": Invalid aircraft name");
                System.exit(1);
            }
            if (check.length != 5) {
                System.out.println("Error on line " + (n + 1) + ": Insufficient values");
                System.exit(1);
            }
            if (!check[2].matches("-?\\d+?")) {
                System.out.println("Error on line " + (n + 1) + ": longitude value has to be a number");
                System.exit(1);
            }
            if (!check[3].matches("-?\\d+?")) {
                System.out.println("Error on line " + (n + 1) + ": latitude value has to be a number");
                System.exit(1);
            }
            if (!check[4].matches("-?\\d+?")) {
                System.out.println("Error on line " + (n + 1) + ": Height value has to be a number");
                System.exit(1);
            }
//            for (int n = 1; n < airCraftList.length; n++) {
//                String[] check = airCraftList[n].split(" ");
//
//                if ((check[1].charAt(0) != check[0].charAt(0)) || check[1].length() < 2) {
//                    System.out.println("Error on line " + (n + 1) + ": Invalid aircraft name");
//                    System.exit(1);
//                }
//                if (check.length != 5) {
//                    System.out.println("Error on line " + (n + 1) + ": Insufficient values");
//                    System.exit(1);
//                }
//                if (!check[2].matches("-?\\d+?")) {
//                    System.out.println("Error on line " + (n + 1) + ": longitude value has to be a number");
//                    System.exit(1);
//                }
//                if (!check[3].matches("-?\\d+?")) {
//                    System.out.println("Error on line " + (n + 1) + ": latitude value has to be a number");
//                    System.exit(1);
//                }
//                if (!check[4].matches("-?\\d+?")) {
//                    System.out.println("Error on line " + (n + 1) + ": Height value has to be a number");
//                    System.exit(1);
//                }
//            }
        }
    }


}
