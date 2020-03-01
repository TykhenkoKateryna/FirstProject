
public class Application7 {

    public static void main(String[] args) {

        int[] values = { 3, 5, 7 };
        System.out.println(values[1]);

        int[][] grid = { { 2, 45, 6554, 24 },
                { 4, 8 },
                { 56, 7, 5 }

        };
        System.out.println(grid[2][0]);
        System.out.println(grid[1][1]);

        String[][] texts = new String[2][3];
        System.out.println(texts[1][2]);
        texts[1][2] = "Hello" + "\n" +"everybody";
        System.out.println(texts[1][2]);

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }

    }
}

