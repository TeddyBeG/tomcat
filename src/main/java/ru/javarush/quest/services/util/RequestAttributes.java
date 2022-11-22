package ru.javarush.quest.services.util;

import ru.javarush.quest.dtos.QuestDto;
import ru.javarush.quest.dtos.QuestionDto;
import ru.javarush.quest.services.adapters.RequestAdapter;

public final class RequestAttributes {
    public static final String QUEST = "quest";
    public static final String QUESTION = "question";

    private final RequestAdapter request;

    public RequestAttributes(RequestAdapter request) {
        this.request = request;
    }

    public void setQuestion(QuestionDto question) {
        request.setAttribute(QUESTION, question);
    }

    public void setQuest(QuestDto quest) {
        request.setAttribute(QUEST, quest);
    }
}