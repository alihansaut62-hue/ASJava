public class mainA {

    private String[] name = new String[10];
    private int size = 0;

    public String get(int index){
        if(index < 0){
            throw new IndexOutOfBoundsException();

        }
        System.out.println(name[index]);
        return name[index];
    }

    public void add(String element){

        // resize ДО добавления
        if (size == name.length){
            String[] newArray = new String[name.length * 2];
            for (int i = 0; i < name.length; i++){
                newArray[i] = name[i];
            }
            name = newArray;
        }

        name[size] = element;
        size++;
    }



    public void remove(int index){
        if(index < 0 ){
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < size - 1; i++){
            name[i] = name[i + 1];

        }

        name[size - 1] = null; // правильный индекс
        size--;
    }

    public void remove(String element){
        for (int i = 0; i < size; i++){
            if (element.equals(name[i])){   // правильное сравнение
                remove(i);
                return;  // удаляем первый найденный элемент
            }
        }
    }

    public int getSize() {
        return size;
    }
}
