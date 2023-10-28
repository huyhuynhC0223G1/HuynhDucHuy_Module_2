package ss8_clean_code.mvc.service;

import ss8_clean_code.mvc.repository.IRepoStudent;
import ss8_clean_code.mvc.repository.RepoStudent;

public class SerStudent implements ISerStudent{
    private IRepoStudent iRepoStudent = new RepoStudent();

    @Override
    public void showListStudent() {
        iRepoStudent.showListStudent();
    }
}
