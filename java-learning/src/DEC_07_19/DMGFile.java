package DEC_07_19;

public class DMGFile implements ReadFile {
    @Override
    public void connect() {
        System.out.println("getting from Readfile");
    }

    @Override
    public void getData() {
        System.out.println("getting from Readfile");
    }

    @Override
    public void saveData() {
        System.out.println("getting from Readfile");
    }

    @Override
    public void updateData() {
        System.out.println("getting from Readfile");
    }
}
