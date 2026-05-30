CREATE TABLE IF NOT EXISTS "products" (
	"product_id" SERIAL NOT NULL,
	"product_name" VARCHAR(255) NOT NULL,
	"description" TEXT NOT NULL,
	"sku" VARCHAR(100) NOT NULL UNIQUE,
	"price" DECIMAL(10,2) NOT NULL CHECK(price >= 0),
	"category_id" INTEGER NOT NULL,
	"created_at" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY("product_id")
);




CREATE TABLE IF NOT EXISTS "categories" (
	"category_id" SERIAL NOT NULL,
	"category_name" VARCHAR(255) NOT NULL UNIQUE,
	PRIMARY KEY("category_id")
);




CREATE TABLE IF NOT EXISTS "inventory" (
	"inventory_id" SERIAL NOT NULL,
	"product_id" INTEGER NOT NULL UNIQUE,
	"stock" INTEGER NOT NULL CHECK(stock >= 0),
	"updated_at" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY("inventory_id")
);




CREATE TABLE IF NOT EXISTS "users" (
	"user_id" SERIAL NOT NULL,
	"username" VARCHAR(100) NOT NULL UNIQUE,
	"email" VARCHAR(255) NOT NULL UNIQUE,
	"password" VARCHAR(255) NOT NULL,
	"role_id" INTEGER NOT NULL,
	"created_at" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY("user_id")
);




CREATE TABLE IF NOT EXISTS "roles" (
	"role_id" SERIAL NOT NULL,
	"role_name" VARCHAR(100) NOT NULL UNIQUE,
	PRIMARY KEY("role_id")
);



ALTER TABLE "users"
ADD FOREIGN KEY("role_id") REFERENCES "roles"("role_id")
ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE "products"
ADD FOREIGN KEY("category_id") REFERENCES "categories"("category_id")
ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE "inventory"
ADD FOREIGN KEY("product_id") REFERENCES "products"("product_id")
ON UPDATE NO ACTION ON DELETE NO ACTION;