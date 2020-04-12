package steps;

import com.codeborne.selenide.Condition;
import pages.AppTourPage;
import pages.DashBoardPage;
import utils.TimeOutUtils;

import static com.codeborne.selenide.Selenide.page;

public class AppTourSteps {

    private AppTourPage appTourPage = page(AppTourPage.class);
    private DashBoardPage dashBoardPage = page(DashBoardPage.class);


    public void swipeAppTour(){
        appTourPage.goToAppButton.shouldBe(Condition.visible);
        appTourPage.tour_content_title.shouldBe(Condition.visible);
        TimeOutUtils.swipeByElements(appTourPage.tour_content_title, appTourPage.appTourSocial);
        appTourPage.goToAppButton.click();
        dashBoardPage.permissionAllowButton.shouldBe(Condition.visible);
    }

}
