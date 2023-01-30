public class view {
    public static void treeView(Persona root, int num){
        String line = "_".repeat(num);
//        System.out.println(line + root.FullName);
        System.out.println(line + root.GetName());
        for (Persona a: root.getListName()) {
            treeView(a, num + 1);
        }
    }
}

