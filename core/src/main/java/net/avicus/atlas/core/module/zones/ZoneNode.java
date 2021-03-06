package net.avicus.atlas.core.module.zones;

import java.util.List;
import java.util.Optional;
import lombok.Getter;
import lombok.ToString;
import net.avicus.atlas.core.match.Match;
import net.avicus.atlas.core.util.region.Region;

@Getter
@ToString
public class ZoneNode extends Zone {

  private final List<Zone> zones;

  public ZoneNode(Match match, Region region, Optional<ZoneMessage> message, List<Zone> zones) {
    super(match, region, message);
    this.zones = zones;
  }

  @Override
  public boolean isActive() {
    return this.zones.stream().anyMatch(Zone::isActive);
  }
}
