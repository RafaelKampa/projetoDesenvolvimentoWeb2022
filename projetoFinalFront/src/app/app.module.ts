import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatInputModule} from '@angular/material/input';
import { HttpClientModule } from '@angular/common/http';
import { UsuarioComponent } from './usuario/usuario.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import {MatMenuModule} from '@angular/material/menu';
import { LoginComponent } from './login/login.component';
import { LayoutComponent } from './layout/layout.component';
import {MatButtonModule} from '@angular/material/button';
import {MatDatepickerModule} from '@angular/material/datepicker'
import { MatNativeDateModule, MatOption } from '@angular/material/core';
import { CurrencyMaskModule } from "ng2-currency-mask";
import {MatTable, MatTableModule} from '@angular/material/table';
import { NgxMaskModule, IConfig } from 'ngx-mask';
import { CadastroServicoComponent } from './cadastro-servico/cadastro-servico.component'
import { MatSelectModule } from '@angular/material/select';
import { CommonModule } from '@angular/common';
import { CentroCustoComponent } from './centro-custo/centro-custo.component';
import { ServicoHomeComponent } from './servico-home/servico-home.component';
import { ListarServicosComponent } from './listar-servicos/listar-servicos.component';
import { ListarCentrosComponent } from './listar-centros/listar-centros.component';
import { AvaliarComponent } from './avaliar/avaliar.component';

export const options: Partial<null|IConfig> | (() => Partial<IConfig>) = null;

@NgModule({
  declarations: [
    AppComponent,
    UsuarioComponent,
    LoginComponent,
    LayoutComponent,
    CadastroServicoComponent,
    CentroCustoComponent,
    ServicoHomeComponent,
    ListarServicosComponent,
    ListarCentrosComponent,
    AvaliarComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule,
    MatInputModule,
    HttpClientModule,
    MatToolbarModule,
    MatIconModule,
    MatMenuModule,
    ReactiveFormsModule,
    MatButtonModule,
    MatDatepickerModule,
    MatNativeDateModule,
    CurrencyMaskModule, //npm install ng2-currency-mask --save
    MatTableModule,
    NgxMaskModule.forRoot(), //npm install --save ngx-mask
    MatSelectModule,
    CommonModule,
    
  ],
  providers: [
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
