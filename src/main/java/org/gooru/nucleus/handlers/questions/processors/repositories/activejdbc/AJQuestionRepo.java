package org.gooru.nucleus.handlers.questions.processors.repositories.activejdbc;

import org.gooru.nucleus.handlers.questions.processors.ProcessorContext;
import org.gooru.nucleus.handlers.questions.processors.repositories.QuestionRepo;
import org.gooru.nucleus.handlers.questions.processors.repositories.activejdbc.dbhandlers.DBHandlerBuilder;
import org.gooru.nucleus.handlers.questions.processors.repositories.activejdbc.transactions.TransactionExecutor;
import org.gooru.nucleus.handlers.questions.processors.responses.MessageResponse;

/**
 * Created by ashish on 11/1/16.
 */
public class AJQuestionRepo implements QuestionRepo {
  private final ProcessorContext context;

  public AJQuestionRepo(ProcessorContext context) {
    this.context = context;
  }

  @Override
  public MessageResponse updateQuestion() {
    return new TransactionExecutor().executeTransaction(new DBHandlerBuilder().buildUpdateQuestionHandler(context));

  }

  @Override
  public MessageResponse deleteQuestion() {
    return new TransactionExecutor().executeTransaction(new DBHandlerBuilder().buildDeleteQuestionHandler(context));
  }

  @Override
  public MessageResponse fetchQuestion() {
    return new TransactionExecutor().executeTransaction(new DBHandlerBuilder().buildFetchQuestionHandler(context));

  }

  @Override
  public MessageResponse createQuestion() {
    return new TransactionExecutor().executeTransaction(new DBHandlerBuilder().buildCreateQuestionHandler(context));

  }
}
