package nio;

import java.io.File;

public class PartitionSpace {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        for (File root : roots) {
            long total = root.getTotalSpace();
            long free = root.getFreeSpace();
            long usable = root.getUsableSpace();
            long used = total - free;
            double gb = 1024.0 * 1024 * 1024;
            System.out.println("partition: " + root);
            System.out.printf("Free Space : %.2f GB \n", free / gb);
            System.out.printf("Used Space : %.2f GB \n", used / gb);
            System.out.printf("Total Space : %.2f GB \n", total / gb);
        }
    }
}
