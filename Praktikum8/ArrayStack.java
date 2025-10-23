import java.util.ArrayList;

public class ArrayStack<T> {
    private ArrayList<T> items;

    public ArrayStack() {
        items = new ArrayList<>();
    }

    // Menambahkan elemen ke atas stack
    public void push(T item) {
        items.add(item);
    }

    // Menghapus dan mengembalikan elemen teratas
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Underflow Error: Stack kosong");
        }
        return items.remove(items.size() - 1);
    }

    // Mengecek apakah stack kosong
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // Program utama untuk menguji stack
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1000);
        stack.push(2000);
        stack.push(3000);

        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 2
        System.out.println(stack.pop()); // 1
    }
}
