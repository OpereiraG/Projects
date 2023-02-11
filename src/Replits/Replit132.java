package Replits;

public class Replit132 {

        public static void main(String[] args) {
            int[][] a = {
                    {1, 2, 3, 4},
                    {4, 5, 6, 7},
                    {1, 3, 5, 7}
            };
            for(int[]arr : a)
            {
                for(int e : arr)
                {
                    System.out.print((e-10) + " " );
                }
                System.out.println();
            }
        }
}

