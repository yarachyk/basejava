/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size  = 0;

    void clear() {
        for (int i=0; i<storage.length; i++){
            storage[i] = null;
        }
    }

    void save(Resume r) {
        storage[size] = r;
        size++;

    }

    Resume get(String uuid) {

        return null;
    }

    void delete(String uuid) {
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] newst = new Resume[size];
        for (int i=0; i<size; i++){
            if (storage[i]!=null){
                newst[i]=storage[i];
            }
            else break;
        }
        return newst;
    }

    int size() {
        int size = getAll().length;

       return size;
    }
}
