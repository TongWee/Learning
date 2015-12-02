package callback;

public class ContentPresenterImpl implements ContentPresenter,
		OnGetContentCallBack {
	private ContentInteractor interactor = new ContentInteractorImpl();
	private View view;

	public ContentPresenterImpl(View _view) {
		this.view = _view;
	}

	@Override
	public void onSuccess(StudentInfo stuInfo) {
		if (stuInfo.getInfo() != null)
			view.showInfo(stuInfo);
	}

	@Override
	public void loadContent() {
		// TODO Auto-generated method stub
		view.showProgress();
		interactor.getContent(this);
		view.hideProgress();
	}
}
