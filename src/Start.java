public class Start {
    public static void main(String[] args) {
        Vector a = new Vector(5);
        a.setNewValueToElementsFromVectors(0, 5);
        a.setNewValueToElementsFromVectors(1, 8);
        a.setNewValueToElementsFromVectors(2, 9);
        a.setNewValueToElementsFromVectors(3, 1);
        a.setNewValueToElementsFromVectors(4, 3);

        a.print();
        System.out.println("длина вектора = " + a.getSizeVectors());
        System.out.println("минимальное значение = " + a.getMinElement());
        System.out.println("максимальное значение = " + a.getMaxElement());
        a.sortMaxToMin();
        a.print();
        a.sortMinToMax();
        a.print();
        System.out.println("нахождение евклидовой нормы = " + a.getEuclideanNormal());
        Vector b = a.mulNumberOnVector(7);
        a.print();
        b.print();
        Vector sum = new Vector();
        sum = sum.sumVector(a, b);
        sum.print();
        System.out.println("скалярное произведение = " + a.scalar(b));

    }
}
