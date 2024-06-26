import java.util.ArrayList;
public class MazePath {
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        Path(2, 0, 0, "", ans);
        for (String path : ans) {
            System.out.println(path);
        }

    }
    public static void Path(int n, int row, int col, String pathSoFar, ArrayList<String> ans) {
        if (row == n && col == n) {
            ans.add(pathSoFar);
            return;
        }
        if (row > n || col > n) {
            return;
        }
        Path(n, row, col + 1, pathSoFar + "H", ans);
        Path(n, row + 1, col, pathSoFar + "V", ans);
        Path(n, row + 1, col + 1, pathSoFar + "D", ans);
    }
}
