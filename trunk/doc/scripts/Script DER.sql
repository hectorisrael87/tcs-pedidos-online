SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';


-- -----------------------------------------------------
-- Table `TCS`.`Rol`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TCS`.`Rol` ;

CREATE  TABLE IF NOT EXISTS `TCS`.`Rol` (
  `idRol` INT NOT NULL AUTO_INCREMENT ,
  `titulo` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`idRol`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TCS`.`Usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TCS`.`Usuario` ;

CREATE  TABLE IF NOT EXISTS `TCS`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT ,
  `nombre` VARCHAR(45) NOT NULL ,
  `email` VARCHAR(45) NOT NULL ,
  `password` VARCHAR(45) NOT NULL ,
  `dni` INT NOT NULL ,
  `telefono` INT NOT NULL ,
  `domicilio` VARCHAR(45) NOT NULL ,
  `cuit` INT NOT NULL ,
  `rol` INT NOT NULL ,
  `activo` INT NOT NULL ,
  PRIMARY KEY (`idUsuario`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TCS`.`FormaPago`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TCS`.`FormaPago` ;

CREATE  TABLE IF NOT EXISTS `TCS`.`FormaPago` (
  `idFormaPago` INT NOT NULL AUTO_INCREMENT ,
  `tipoPago` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`idFormaPago`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TCS`.`Estado`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TCS`.`Estado` ;

CREATE  TABLE IF NOT EXISTS `TCS`.`Estado` (
  `idEstado` INT NOT NULL AUTO_INCREMENT ,
  `nombreEstado` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`idEstado`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TCS`.`Pedido`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TCS`.`Pedido` ;

CREATE  TABLE IF NOT EXISTS `TCS`.`Pedido` (
  `idPedido` INT NOT NULL AUTO_INCREMENT ,
  `fecha` DATE NOT NULL ,
  `hora` TIME NOT NULL ,
  `usuario` INT NOT NULL ,
  `estado` INT NOT NULL ,
  `formaPago` INT NOT NULL ,
  PRIMARY KEY (`idPedido`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TCS`.`Marca`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TCS`.`Marca` ;

CREATE  TABLE IF NOT EXISTS `TCS`.`Marca` (
  `idMarca` INT NOT NULL AUTO_INCREMENT ,
  `nombre` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`idMarca`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TCS`.`Articulo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TCS`.`Articulo` ;

CREATE  TABLE IF NOT EXISTS `TCS`.`Articulo` (
  `idArticulo` INT NOT NULL AUTO_INCREMENT ,
  `nombre` VARCHAR(45) NOT NULL ,
  `marca` INT NOT NULL ,
  `propiedades` LONGTEXT NOT NULL ,
  `precio` DOUBLE NOT NULL ,
  `activo` INT NOT NULL ,
  PRIMARY KEY (`idArticulo`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TCS`.`DetallePedido`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TCS`.`DetallePedido` ;

CREATE  TABLE IF NOT EXISTS `TCS`.`DetallePedido` (
  `idDetallePedido` INT NOT NULL AUTO_INCREMENT ,
  `pedido` INT NOT NULL ,
  `cantidad` INT NOT NULL ,
  `articulo` INT NOT NULL ,
  `precioTotal` DOUBLE NOT NULL ,
  PRIMARY KEY (`idDetallePedido`) )
ENGINE = InnoDB;

CREATE INDEX `fk_detpedido_articuulo` ON `TCS`.`DetallePedido` (`articulo` ASC) ;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
