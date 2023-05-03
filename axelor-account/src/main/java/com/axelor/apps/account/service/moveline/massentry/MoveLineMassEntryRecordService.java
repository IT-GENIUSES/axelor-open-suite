package com.axelor.apps.account.service.moveline.massentry;

import com.axelor.apps.account.db.Move;
import com.axelor.apps.account.db.MoveLineMassEntry;
import com.axelor.apps.base.db.Company;
import com.axelor.exception.AxelorException;

public interface MoveLineMassEntryRecordService {

  void setCurrencyRate(Move move, MoveLineMassEntry moveLine) throws AxelorException;

  void resetDebit(MoveLineMassEntry moveLine);

  void setMovePfpValidatorUser(MoveLineMassEntry moveLine, Company company);
}
