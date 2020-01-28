package java;

public class ArrayStorage {

    private Resume[] resumes = new Resume[10000];

    public void save(Resume resume) {
        for (int i = 0; i < resumes.length; i++) {
            if (resumes[i] == null) {
                resumes[i] = resume;
            }
        }
    }

    public Resume get(int value) {
        for (int i = 0; i < resumes.length; i++) {
            if (i + 1 == value) {
                return resumes[i];
            }
        }
        return null;
    }

    public Resume[] getAll() {
        return resumes;
    }

    public void delete(Resume resume) {
        for (int i = 0; i < resumes.length; i++) {
            if (resumes[i].equals(resume)) {
                resumes[i] = null;
            }
        }
    }

    public int size() {
        return resumes.length;
    }

    public void clear(Resume[] resumes) {
        for (int i = 0; i < resumes.length; i++) {
            resumes[i] = null;
        }
    }
}
