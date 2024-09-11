public class Main {

    public static void main(String[] args) {
        String[][] arr1 = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };

        String[][] arr2 = {
                {"1", "1", "1"},
                {"2", "2", "2"},
                {"3", "3", "3"}
        };

        String[][] arr3 = {
                {"1", "1", "cat", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };

        RebuildArrAndSum.rebuildArrAndSum(arr1);
        RebuildArrAndSum.rebuildArrAndSum(arr2);
        RebuildArrAndSum.rebuildArrAndSum(arr3);
    }
}
