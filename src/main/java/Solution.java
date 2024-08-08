import java.util.Arrays;

class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int n = rows * cols;
        int[][] res = new int[n][2];
        res[0] = new int[] {rStart, cStart};
        int i = 1;
        int h = 1;
        int v = 1;
        int[] cur = {rStart, cStart};
        int dir = 0; // 0 - E, 1 - S, 2 - W, 3 - N
        
        while(i < n) {
          //  System.out.println(Arrays.toString(cur));
            if(dir == 0) {
                int newX = cur[1] + h;
                while(cur[1] < newX) {
                    cur[1]++;
                    if(cur[0] >= 0 && cur[0] < rows && cur[1] >=0 && cur[1] < cols){
                        res[i++] = new int[] {cur[0], cur[1]};
                    }
                }
                h++;
            }else if(dir == 1) {
                int newY = cur[0] + v;
                while(cur[0] < newY) {
                    cur[0]++;
                    if(cur[0] >= 0 && cur[0] < rows && cur[1] >=0 && cur[1] < cols){
                        res[i++] = new int[] {cur[0], cur[1]};
                    }
                }
                v++;
            }else if(dir == 2) {
                int newX = cur[1] - h;
                while(cur[1] > newX) {
                    cur[1]--;
                    if(cur[0] >= 0 && cur[0] < rows && cur[1] >=0 && cur[1] < cols){
                        res[i++] = new int[] {cur[0], cur[1]};
                    }
                }
                h++;   
            }else if(dir == 3) {
                int newY = cur[0] - v;
                while(cur[0] > newY) {
                    cur[0]--;
                    if(cur[0] >= 0 && cur[0] < rows && cur[1] >=0 && cur[1] < cols){
                        res[i++] = new int[] {cur[0], cur[1]};
                    }
                }
                v++;
            }
            dir++;
            if(dir == 4) {
                dir = 0;
            }

        }
        return res;
    }
}