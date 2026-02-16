public class scratch {

    private String[] array = new String[10];
    private int size = 0;

    public String get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        System.out.println(array[index]);
        return array[index];

    }

    public void add(String element){

        // resize ДО добавления
        if (size == array.length){
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }

        array[size] = element;
        size++;
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < size - 1; i++){
            array[i] = array[i + 1];
        }

        array[size - 1] = null; // правильный индекс
        size--;
    }

    public void remove(String element){
        for (int i = 0; i < size; i++){
            if (element.equals(array[i])){   // правильное сравнение
                remove(i);
                return;  // удаляем первый найденный элемент
            }
        }
    }

    public int getSize() {
        return size;
    }
}
