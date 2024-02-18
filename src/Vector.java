public class Vector {
    private double[] vectors;

    public Vector() {
    }

    public Vector(int sizeVector) {
        this.vectors = new double[sizeVector];
    }

    public double[] getVectors() {
        return vectors;
    }

    public double getElementFromVectors(int index) {
        return vectors[index];
    }


    public void setVectors(double[] vectors) {
        this.vectors = vectors;
    }

    public void setNewValueToElementsFromVectors(int index, double newValue) {
        vectors[index] = newValue;
    }

    public int getSizeVectors() {
        return vectors.length;
    }

    public double getMinElement() {
        double min = vectors[0];
        for (int i = 0; i < getSizeVectors(); i++) {
            if (vectors[i] < min) min = vectors[i];
            //System.out.println(i + " " + vectors[i]);
        }
        return min;
    }

    public double getMaxElement() {
        double max = vectors[0];
        for (int i = getSizeVectors() - 1; i > 0; i--) {
            if (vectors[i] > max) max = vectors[i];
            //System.out.println(i + " " + vectors[i]);
        }
        return max;
    }

    public void sortMaxToMin() {
        double temp;
        int i, j, k = 0;
        while (k < getSizeVectors()) {

            for (i = 0; i < getSizeVectors(); i++) {
                temp = vectors[i];
                j = i + 1;
                if (j < getSizeVectors() && vectors[i] < vectors[j]) {
                    setNewValueToElementsFromVectors(i, getElementFromVectors(j));
                    setNewValueToElementsFromVectors(j, temp);
                }
            }
            k++;
        }
    }

    public void sortMinToMax() {
        double temp;
        int i, j, k = 0;
        while (k < getSizeVectors()) {

            for (i = 0; i < getSizeVectors(); i++) {
                temp = vectors[i];
                j = i + 1;
                if (j < getSizeVectors() && vectors[i] > vectors[j]) {
                    setNewValueToElementsFromVectors(i, getElementFromVectors(j));
                    setNewValueToElementsFromVectors(j, temp);
                }
            }
            k++;
        }
    }

    public double getEuclideanNormal(){
        double sumP = 0;
        for(double element: vectors){
            sumP += element * element;
        }
        return Math.sqrt(sumP);
    }

    public Vector mulNumberOnVector(double number){
        Vector newVector = new Vector(this.getSizeVectors());
        for(int i = 0; i < this.getSizeVectors(); i++){
            newVector.setNewValueToElementsFromVectors(i, this.getElementFromVectors(i) * number);
        }
        return newVector;
    }

    public Vector sumVector(Vector too, Vector fuu){
        if(too.getSizeVectors() != fuu.getSizeVectors()){
            System.out.println("Vectors not =");
            return null;
        } else{
            Vector sum = new Vector(too.getSizeVectors());
            for(int i = 0; i < too.getSizeVectors(); i++){
                sum.setNewValueToElementsFromVectors(i, too.getElementFromVectors(i) + fuu.getElementFromVectors(i));
            }
            return sum;
        }
    }

    public Double scalar(Vector vector){
        if(this.getSizeVectors() != vector.getSizeVectors()){
            System.out.println("Vectors not =");
            return null;
        } else{
            double scalar = 0;
            for(int i = 0; i < this.getSizeVectors(); i++){
                scalar += this.getElementFromVectors(i) * vector.getElementFromVectors(i);
            }
            return scalar;
        }
    }

    public void print(){
        System.out.print("[ ");
        for(int i = 0; i < this.getSizeVectors(); i++){
            System.out.print("{" + i + ":" + this.getElementFromVectors(i) + "} ");
        }
        System.out.print("]\n");
    }


}
