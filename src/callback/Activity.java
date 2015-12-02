package callback;

public class Activity implements View {
	ContentPresenter presenter = new ContentPresenterImpl(this);

	@Override
	public void showProgress() {
		// TODO Auto-generated method stub
		System.out.println("Loading...");
	}

	@Override
	public void hideProgress() {
		// TODO Auto-generated method stub
		System.out.println("Finish.");
	}

	@Override
	public void showInfo(StudentInfo info) {
		// TODO Auto-generated method stub
		System.out.println(info.getInfo());
	}

	public void execute() {
		presenter.loadContent();
	}

}
