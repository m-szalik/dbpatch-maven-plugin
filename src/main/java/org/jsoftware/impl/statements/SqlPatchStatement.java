package org.jsoftware.impl.statements;

import org.jsoftware.impl.PatchStatement;

public class SqlPatchStatement implements PatchStatement {
	protected String sql;

	public SqlPatchStatement(String sql) {
		this.sql = sql;
	}

	public boolean isDisplayable() {
		return true;
	}

	public String toString() {
		return getClass().getSimpleName() + ":" + sql;
	}

	public boolean isExecutable() {
		return true;
	}
	
	public String getCode() {
		return sql;
	}

}
