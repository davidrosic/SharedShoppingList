package david.rosic.shoppinglist;

public class Task {

    private String mName;
    private boolean mChecked;
    private long mId;

    public Task(String mName, boolean mChecked, long mId) {
        this.mName = mName;
        this.mChecked = mChecked;
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public boolean ismChecked() {
        return mChecked;
    }

    public void setmChecked(boolean mChecked) {
        this.mChecked = mChecked;
    }

    public long getmId() {
        return mId;
    }

    public void setmId(long mId) {
        this.mId = mId;
    }

}
