#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
    CREATE USER sartarite;
    CREATE DATABASE sartar;
    GRANT ALL PRIVILEGES ON DATABASE sartar TO sartarite;
EOSQL
