package de.fhdw.ergoholics.brainphaser.model;

import java.util.List;
import de.fhdw.ergoholics.brainphaser.model.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "CHALLENGE".
 */
public class Challenge {

    private Long id;
    private int challengeType;
    /** Not-null value. */
    private String question;
    private long categoryId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient ChallengeDao myDao;

    private List<Answer> answers;

    public Challenge() {
    }

    public Challenge(Long id) {
        this.id = id;
    }

    public Challenge(Long id, int challengeType, String question, long categoryId) {
        this.id = id;
        this.challengeType = challengeType;
        this.question = question;
        this.categoryId = categoryId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getChallengeDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getChallengeType() {
        return challengeType;
    }

    public void setChallengeType(int challengeType) {
        this.challengeType = challengeType;
    }

    /** Not-null value. */
    public String getQuestion() {
        return question;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setQuestion(String question) {
        this.question = question;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Answer> getAnswers() {
        if (answers == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            AnswerDao targetDao = daoSession.getAnswerDao();
            List<Answer> answersNew = targetDao._queryChallenge_Answers(id);
            synchronized (this) {
                if(answers == null) {
                    answers = answersNew;
                }
            }
        }
        return answers;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetAnswers() {
        answers = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
