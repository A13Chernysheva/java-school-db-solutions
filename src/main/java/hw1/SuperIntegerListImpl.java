package hw1;

/**
 * @author Anastasia Chernysheva
 */
public class SuperIntegerListImpl implements SuperIntegerList {

    int[] list;
    int len = 0;

    @Override
    public void add(int number) {
        int[] backupList = new int[len + 1];
        for(int i = 0; i < len; i++) {
            backupList[i] = list[i];
        }
        backupList[len] = number;
        len++;
        list = backupList;
    }

    @Override
    public void removeByIndex(int index) {
        if (index >= 0 && index < len) {
            int[] backupList = new int[len - 1];
            for (int i = 0; i < index; i++) {
                backupList[i] = list[i];
            }
            for (int i = index + 1; i < len; i++) {
                backupList[i - 1] = list[i];
            }
            len--;
            list = backupList;
        }
    }

    public int getIndex(int value) {
        for (int i = 0; i < len; i++) {
            if (list[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void removeByValue(int value) {
        if (getIndex(value) != -1) {
            int[] backupList = new int[len - 1];
            for (int i = 0, j = 0; i < len && j < len - 1; i++, j++) {
                if (list[i] == value) {
                    i++;
                }
                backupList[j] = list[i];
            }
            len--;
            list = backupList;
        }
    }

    @Override
    public int get(int index) {
        return list[index];
    }

    @Override
    public void printAll() {
        for (int i = 0; i < len; i++) {
            System.out.print(list[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}
