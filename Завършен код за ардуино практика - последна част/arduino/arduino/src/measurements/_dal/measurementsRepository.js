
class MeasurementsRepository {    
    _sql = null;

    constructor(sql) {
        this._sql = sql;
    }

    async getAll() {
        let results = await this._sql
            .query`SELECT Id, EventDate, Value FROM Events ORDER BY Id`;
        
        return results.recordset;
    }
    async getAllFromToday() {
        let results = await this._sql
            .query`SELECT Id, EventDate, Value FROM Events WHERE Value >= 1000 ORDER BY Id `;
        
        return results.recordset;
    }

    async getById(id) {
        let results = await this._sql
            .query`SELECT Id, EventDate, Value FROM Events WHERE Id = ${id}`;
        
        return results.recordset;
    }

    async create(value) {
        await this._sql
            .query`INSERT INTO Events (Value) VALUES (${value})`;
    }

    async deleteById(id) {
        await this._sql
            .query`DELETE FROM Events WHERE Id = ${id}`;
    }

    async update(id, value) {
        await this._sql
            .query`UPDATE Events SET Value = ${value} WHERE Id = ${id}`;
    }
}

module.exports.MeasurementsRepository = MeasurementsRepository;