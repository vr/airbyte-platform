package io.airbyte.data.services.shared

enum class ConnectionAutoDisabledReason {
  ONLY_FAILED_JOBS_RECENTLY,
  TOO_MANY_CONSECUTIVE_FAILED_JOBS_IN_A_ROW,
  SCHEMA_CHANGES_ARE_BREAKING,
  DISABLE_CONNECTION_IF_ANY_SCHEMA_CHANGES,
  INVALID_CREDIT_BALANCE,
  CONNECTOR_NOT_SUPPORTED,
  WORKSPACE_IS_DELINQUENT,
}