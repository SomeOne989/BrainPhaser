package de.fhdw.ergoholics.brainphaser;

import de.fhdw.ergoholics.brainphaser.activities.About.AboutActivity;
import de.fhdw.ergoholics.brainphaser.activities.CategorySelect.SelectCategoryPage;
import de.fhdw.ergoholics.brainphaser.activities.Challenge.AnswerFragment;
import de.fhdw.ergoholics.brainphaser.activities.Challenge.ChallengeActivity;
import de.fhdw.ergoholics.brainphaser.activities.Challenge.FinishChallengeFragment;
import de.fhdw.ergoholics.brainphaser.activities.Challenge.MultipleChoiceFragment;
import de.fhdw.ergoholics.brainphaser.activities.Challenge.SelfTestDialogFragment;
import de.fhdw.ergoholics.brainphaser.activities.Challenge.SelfTestFragment;
import de.fhdw.ergoholics.brainphaser.activities.Challenge.TextFragment;
import de.fhdw.ergoholics.brainphaser.activities.Settings.SettingsActivity;
import de.fhdw.ergoholics.brainphaser.activities.UserCreation.CreateUserActivity;
import de.fhdw.ergoholics.brainphaser.activities.UserSelection.UserAdapter;
import de.fhdw.ergoholics.brainphaser.activities.UserSelection.UserSelectionActivity;
import de.fhdw.ergoholics.brainphaser.activities.main.MainActivity;
import de.fhdw.ergoholics.brainphaser.activities.main.ProxyActivity;
import de.fhdw.ergoholics.brainphaser.activities.statistics.StatisticsActivity;
import de.fhdw.ergoholics.brainphaser.logic.UserLogicFactory;
import de.fhdw.ergoholics.brainphaser.logic.fileimport.bpc.BPCWrite;

/**
 * Created by funkv on 06.03.2016.
 *
 * App Component that defines injection targets for DI.
 */
public interface BrainPhaserComponent {
    void inject(MainActivity mainActivity);
    void inject(ProxyActivity activity);
    void inject(ChallengeActivity challengeActivity);
    void inject(MultipleChoiceFragment questionFragment);
    void inject(TextFragment textFragment);
    void inject(SelfTestFragment selfTestFragment);
    void inject(SelfTestDialogFragment selfTestDialogFragment);
    void inject(FinishChallengeFragment finishChallengeFragment);
    void inject(CreateUserActivity createUserActivity);
    void inject(UserAdapter userAdapter);
    void inject(UserSelectionActivity activity);
    void inject(StatisticsActivity activity);
    void inject(SettingsActivity activity);

    void inject(AboutActivity activity);


    void inject(SelectCategoryPage selectCategoryPage);
    void inject(AnswerFragment answerFragment);

    void inject(BPCWrite bpcWrite);

    void inject(UserLogicFactory f);
}