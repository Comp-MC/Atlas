package net.avicus.atlas.core.module.spawns;

public enum SelectionMode {
  /**
   * Select one randomly.
   */
  RANDOM,

  /**
   * Select furthest away from enemies (other competitors).
   */
  SAFE,

  /**
   * Select furthest away from all players.
   */
  SPREAD
}
