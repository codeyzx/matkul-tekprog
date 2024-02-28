package models;

public interface ISortable {
    public abstract int compare(Sortable b);

    public static void shell_sort(Sortable[] a) {
        int n = a.length;
        int incr = n / 2;
        while (incr >= 1) {
            for (int i = incr; i < n; i++) {
                Sortable temp = a[i];
                int j = i;
                while (j >= incr && a[j - incr].compare(temp) > 0) {
                    a[j] = a[j - incr];
                    j -= incr;
                }
                a[j] = temp;
            }
            incr /= 2;
        }
    }
}
