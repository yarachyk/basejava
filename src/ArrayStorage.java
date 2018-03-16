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
        Resume res = null;
        for (int i=0; i<size; i++){
            if (storage[i].uuid.equals(uuid)){
                res = storage[i];

            }
        }
        return res;
    }

    void delete(String uuid) {
        for (int i=0; i<size; i++){
            if (storage[i].uuid.equals(uuid)) {
                storage[i]=null;
                break;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] newst = new Resume[size()];
        int j = 0;
        for (int i=0; i<size; i++){
            if (storage[i]!=null){
                newst[j]=storage[i];
                j++;
            }
        }
        return newst;
    }

    int size() {
        int size = 0;
        for(int i=0; i<storage.length; i++){
            if (storage[i]!=null){
                size++;
            }
        }
        return size;
    }
}
