package callback;

public class ContentInteractorImpl implements ContentInteractor {
	@Override
	public void getContent(OnGetContentCallBack onGetContentCallBack) {
		StudentInfo stuInfo = new StudentInfo("I am Weston.");
		onGetContentCallBack.onSuccess(stuInfo);
	}
}
