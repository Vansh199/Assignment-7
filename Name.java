public class Name {
    public static void main(String[] args) {
        int n=11;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j && i<=(n-1)/2 || i+j==n-1 && i<=(n-1)/2){
                    System.out.print("v");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0){
                    System.out.print("a");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(j==0 || i==j || j==n-1){
                    System.out.print("n");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2 || i==n-1 && j<=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2){
                    System.out.print("s");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==(n-1)/2){
                    System.out.print("h");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        int m =11;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j<=(m-1)/2 || j==0 || i==m-1 && j<=(m-1)/2 || i==(m-1)/2 && j>2 && j<=(m-1)/2 || j==(m-1)/2 && i>(m-1)/2){
                    System.out.print("g");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("   ");
            for(int j=0;j<m;j++){
                if(i==0 && j>0 && j<(m-1)/2 || j==0 && i>0 && i<m-1 || i==m-1 && j>0 && j<(m-1)/2 || j==(m-1)/2 && i>0 && i<m-1){
                    System.out.print("o");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("   ");
            for(int j=0;j<m;j++){
                if(i==j && i<=(m-1)/2 || i+j==m-1){
                    System.out.print("y");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("   ");
            for(int j=0;j<m;j++){
                if(i==0 && j>0 && j<(m-1)/2 || j==0 && i>0 || i==(m-1)/2 && j<=(m-1)/2 || j==(m-1)/2 && i>0){
                    System.out.print("a");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("   ");
            for(int j=0;j<m;j++){
                if(j==0 || i==m-1){
                    System.out.print("l");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
