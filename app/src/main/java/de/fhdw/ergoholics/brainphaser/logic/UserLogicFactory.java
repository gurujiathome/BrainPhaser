package de.fhdw.ergoholics.brainphaser.logic;

import de.fhdw.ergoholics.brainphaser.database.ChallengeDataSource;
import de.fhdw.ergoholics.brainphaser.database.CompletionDataSource;
import de.fhdw.ergoholics.brainphaser.model.User;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by funkv on 06.03.2016.
 */

/**
 * Factory that is used to create logic objects which require a user.
 * Dependencies are injected automatically.
 */
public class UserLogicFactory {
    @Inject CompletionDataSource mCompletionDataSource;
    @Inject ChallengeDataSource mChallengeDataSource;

    /**
     * Create a DueChallengeLogic for the specified user.
     * @param user user whose challenges are inspected
     * @return the DueChallengeLogic object
     */
    public DueChallengeLogic createDueChallengeLogic(User user) {
        return new DueChallengeLogic(user, mCompletionDataSource, mChallengeDataSource);
    }
}
