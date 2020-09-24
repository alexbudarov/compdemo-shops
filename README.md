# compdemo-shops
CUBA project demonstrating how to import add-on's entities to additional data store

See also: https://github.com/alexbudarov/compdemo-products

Notable files:
* app.properties, web-app.properties - added additional persistence file to the `cuba.persistenceConfig_products` property (via another property exported by the add-on)
* build.gradle - in the `configure(coreModule) {}` section task `assembleDbScripts` is changed - we need to delete DB scripts brought by the add-on so that they aren't executed on the main datastore
* 01.prods-create-db.sql and 02.prods-create-db.sql - DB scripts for addon's entities are re-generated in the project
